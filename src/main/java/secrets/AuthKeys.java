package secrets;

public class AuthKeys {
    private static String key;

    public static String DiscordAuth() {
        return AuthKeys.key;
    }

    private static String setDiscordAuth() {
        AuthKeys.key = "key";
        return AuthKeys.key;
    }
}
