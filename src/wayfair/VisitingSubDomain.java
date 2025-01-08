package wayfair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitingSubDomain {
    public static void main(String[] args) {
        String[] cpDomains={"170 domain.example.com", "200 some.example.com"};
        findVisitedDomains(cpDomains);
    }

    private static void findVisitedDomains(String[] cpDomains) {
        Map<String, Integer> map= new HashMap<>();
        for(String data: cpDomains){
            String[] entries=data.split("\\s");
            int visitedTimes= Integer.parseInt(entries[0]);
            String[] domainList= entries[1].split("\\.");
            StringBuilder sb= new StringBuilder();
            for(int i=domainList.length-1; i>=0; i--){
                if(i == (domainList.length-1)){
                    sb.append(domainList[i]);
                }else{
                    sb.insert(0, domainList[i]+".");
                }
                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + visitedTimes);
            }
        }
    }
}
