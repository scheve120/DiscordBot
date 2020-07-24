package secrets;

public class AuthKeys {
    private static String key;

    public static String DiscordAuth() {
        return setDiscordAuth();
    }

    private static String setDiscordAuth() {
        AuthKeys.key = "secret";
        return AuthKeys.key;
    }
}
