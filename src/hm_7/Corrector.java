package hm_7;

public class Corrector {

    public String handleData(String[] strs) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs) {

            // spell correction brange - orange
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }

            // spell correction onibn - onion
            if (str.contains("bm")) {
                str = str.replace("bn", "n");
            }

            count++;
            stringBuilder.append(count)
                    .append(") ")
                    .append(str)
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
