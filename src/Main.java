public class Main {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] { "123Abc3434134_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean validate = accountExample.validate(account);
            System.out.println("Account is " + account +" is validate: "+ validate);
        }
        for (String account : invalidAccount) {
            boolean validate = accountExample.validate(account);
            System.out.println("Account is " + account +" is validate: "+ validate);
        }
    }
}
