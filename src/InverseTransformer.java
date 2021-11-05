public class InverseTransformer extends TextTransformer {
    @Override
    public String transform(String text) {
        StringBuilder str = new StringBuilder(text);
        return str.reverse().toString();
    }
}
