class MorningCheck {
    public static void main(String[] args) {
        int time = 15; // Predefined time in hours (24-hour format)

        if (time >= 5 && time < 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Not Morning Time");
        }
    }
}