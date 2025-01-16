class PalindromeCheck {
    String text;

    // constructor
    public PalindromeCheck(String text) {
        this.text = text;
    }

    // Method to check if text is a palindrome
    public boolean isPalindrome() {
        StringBuilder st = new StringBuilder(text);
        st.reverse();
        String reversed = st.toString();
        return text.equals(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome ");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck("aabbaa");
        checker.displayResult();
    }
}
