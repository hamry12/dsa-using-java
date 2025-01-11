package nagarro;

public class ConvertVariableName {

    public static void main(String[] args) {
        String variableName="thisIsAnExample_"; //this_is_an_example

        if(variableName.substring(0,1).matches("[^a-zA-Z]")){
            variableName=variableName.replaceFirst("[^a-zA-Z]", "");
        }

        if(variableName.contains("_")){
            convertToJavaConvetion(variableName);
        }else{
            convertToCPPConvetion(variableName);
        }
    }

    private static void convertToCPPConvetion(String variableName) {
        char[] charArr= variableName.toCharArray();
        StringBuilder sb= new StringBuilder();
        sb.append(charArr[0]);
        for(int i=1; i<charArr.length; i++){
            if(Character.isUpperCase(charArr[i])){
                sb.append("_").append(Character.toLowerCase(charArr[i]));
            }else{
                sb.append(charArr[i]);
            }
        }
        System.out.println(sb.toString());
    }

    private static void convertToJavaConvetion(String variableName) {
        StringBuilder convertedVariableName=new StringBuilder();
        String[] variableArray= variableName.split("_");
        convertedVariableName.append(variableArray[0]);
        for(int i=1; i< variableArray.length; i++){
            convertedVariableName.append(capitaliseFirstLetter(variableArray[i]));
        }
        System.out.println(convertedVariableName.toString());
    }

    private static String capitaliseFirstLetter(String s) {
        return s.substring(0,1).toUpperCase()+s.substring(1);
    }
}
