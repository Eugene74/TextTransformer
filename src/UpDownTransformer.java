public class UpDownTransformer extends TextTransformer{
    @Override
    public String transform(String text) {
        char[] chars = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <chars.length; i++) {
           if(i%2==0){
               stringBuilder.append(Character.toUpperCase(chars[i]));
           } else {
               stringBuilder.append(Character.toLowerCase(chars[i]));
           }
        }
        return stringBuilder.toString();
    }
}

