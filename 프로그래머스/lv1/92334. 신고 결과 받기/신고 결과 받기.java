import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> delDup = new HashSet<>(Arrays.asList(report)); // 중복신고 제거
		Map<String, List<String>> reportLog = new HashMap<>();
		Map<String, Integer> reportCount = new HashMap<>();
		List<Integer> alertCnt = new ArrayList<>();
		
		for(String str : delDup) {
			String user = str.split(" ")[0];
			String reportUser = str.split(" ")[1];
			if(!reportLog.containsKey(user)) {
				reportLog.put(user, new ArrayList<String>());
			} 
			reportLog.get(user).add(reportUser); // 각 유저가 신고한 유저 목록
			
			if(!reportCount.containsKey(reportUser)) reportCount.put(reportUser, 1);
			else reportCount.replace(reportUser, reportCount.get(reportUser) + 1); // 신고당한 횟수 누적
			
		}
		
		// 유저 이름순으로 찾아감
		for(String id : id_list) {
			if(reportLog.containsKey(id)) { // 다른유저를 신고한적이 있는지
				int logCnt = 0; // 신고한 유저가 정지된 횟수 누적
				for(String loggedId : reportLog.get(id)) {
					if(reportCount.get(loggedId) >= k) {
						logCnt++;
					}
				}
				alertCnt.add(logCnt);
			} else {
				alertCnt.add(0);				
			}
		}
        
        return alertCnt.stream().mapToInt(e -> e).toArray();
    }
}