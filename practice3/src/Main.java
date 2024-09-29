public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть значення для типу " + type + ":");
        String input = scanner.nextLine();

        try {
            switch (type) {
                case "byte":
                    byte byteValue = Byte.parseByte(input);
                    System.out.println("Перетворене значення: " + byteValue);
                    break;
                case "short":
                    short shortValue = Short.parseShort(input);
                    System.out.println("Перетворене значення: " + shortValue);
                    break;
                case "int":
                    int intValue = Integer.parseInt(input);
                    System.out.println("Перетворене значення: " + intValue);
                    break;
                case "long":
                    long longValue = Long.parseLong(input);
                    System.out.println("Перетворене значення: " + longValue);
                    break;
                case "float":
                    float floatValue = Float.parseFloat(input);
                    System.out.println("Перетворене значення: " + floatValue);
                    break;
                case "double":
                    double doubleValue = Double.parseDouble(input);
                    System.out.println("Перетворене значення: " + doubleValue);
                    break;
                case "char":
                    if (input.length() == 1) {
                        char charValue = input.charAt(0);
                        System.out.println("Перетворене значення: " + charValue);
                    } else {
                        System.out.println("Помилка: для char потрібно ввести лише один символ.");
                    }
                    break;
                case "boolean":
                    boolean booleanValue = Boolean.parseBoolean(input);
                    System.out.println("Перетворене значення: " + booleanValue);
                    break;
                default:
                    System.out.println("Невідомий тип даних.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Помилка: некоректний формат введення.");
    }
}