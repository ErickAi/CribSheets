//Lambda
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});
Collections.sort(names, (String a, String b) -> b.compareTo(a));
Collections.sort(names, (a, b) -> b.compareTo(a));


@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
Integer converted = converter.convert("123");
System.out.println(converted);

