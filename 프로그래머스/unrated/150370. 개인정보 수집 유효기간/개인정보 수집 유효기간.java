import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		HashMap<String, Integer> termMap = new HashMap<>();
		List<Integer> expired = new ArrayList<>();
		
		for (String term : terms) {
			termMap.put(term.substring(0, term.indexOf(" ")), Integer.parseInt(term.substring(term.indexOf(" ") + 1)));
		}
		
		for (int idx = 0; idx < privacies.length; idx++) {
			String type = privacies[idx].substring(privacies[idx].indexOf(" ") + 1);
			LocalDate strDate = LocalDate.parse(privacies[idx].substring(0, privacies[idx].indexOf(" ")), format);
			LocalDate endDate = strDate.plusMonths(termMap.get(type));
			if(endDate.isBefore(LocalDate.parse(today, format)) || endDate.isEqual(LocalDate.parse(today, format))) {
//				만료기간 이전이거나 같은 날자일경우 만료처리
				expired.add(idx + 1);
			} 
		}
        return expired.stream().mapToInt(i -> i).toArray();
    }
}