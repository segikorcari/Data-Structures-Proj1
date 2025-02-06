PizzaDemo class for testing
class PizzaDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(CrustType.Butter, new ArrayList<>(List.of("cheese", "pepperoni")), SizeType.Medium);
        Pizza pizza2 = new Pizza(CrustType.Garlic, new ArrayList<>(List.of("cheese", "ham", "onion")), SizeType.Large);
        Pizza pizza3 = new Pizza();

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        System.out.println("Pizza1 equals Pizza2: " + pizza1.equals(pizza2));
        System.out.println("Pizza1 compareTo Pizza2: " + pizza1.compareTo(pizza2));
    }
}
