package code_cup.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreprocessDates {

  public static void main(String[] args) {
    System.out.println(preprocessDate(
        List.of("20th Oct 2052", "6th Jun 1933", "26th May 1960", "20th Sep 1958", "16th Mar 2068",
            "25th May 1912", "16th Dec 2018", "26th Dec 2061", "4th Nov 2030", "28th Jul 1963")));
  }

  public static List<String> preprocessDate(List<String> dates) {
    List<String> result = new ArrayList<>();
    Map<String, String> map = new HashMap<>() {{
      put("Jan", "01");
      put("Feb", "02");
      put("Mar", "03");
      put("Apr", "04");
      put("May", "05");
      put("Jun", "06");
      put("Jul", "07");
      put("Aug", "08");
      put("Sep", "09");
      put("Oct", "10");
      put("Nov", "11");
      put("Dec", "12");
    }};

    for (String date : dates) {
      StringBuilder sb = new StringBuilder();
      if (date.length() == 12) {
        sb.append(date, 8, 12)
            .append("-")
            .append(map.get(date.substring(4, 7)))
            .append("-0")
            .append(date.charAt(0));
      } else if (date.length() == 13) {
        sb.append(date, 9, 13)
            .append("-")
            .append(map.get(date.substring(5, 8)))
            .append("-")
            .append(date, 0, 2);
      }
      result.add(sb.toString());
    }

    return result;
  }

}
