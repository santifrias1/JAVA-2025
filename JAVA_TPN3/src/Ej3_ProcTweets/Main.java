/*
Procesamiento de Tweets
author @santiagofrias
*/
public class Main {
    public static void main(String[] args) {

        String tweet1 = "Aguante Java.";
        String tweet2 = "Tweet que excede el límite de 280 caracteres. " +
                "JADN Eiande uebaiked oajubdnaujoen sibaeuiaebffoa uasuyvueb ayviuiadivv ysehcncisiiuaejfubeih idvuyeimc shue98ha8jd0 ue7hs8syge7. " +
                "iabduybe eaieiub euavdie beaujeeiyi uvyvdijsoryfubr uyagiejdiabcyg8 egaedha9jcv9 ioahibcueguayde sbdieubua uh8r3.";
        String tweet3 = "Este es un tweet con un usuario @geronimoBenavides";

        System.out.println("Tweet N°1: " + tweet1);
        System.out.println("Longitud del tweet: " + calcularLongitudTweet(tweet1));
        System.out.println("¿Cumple con el límite?: " + verificarLimiteCaracteres(tweet1));
        System.out.println();

        System.out.println("Tweet N°2: " + tweet2);
        System.out.println("Longitud del tweet: " + calcularLongitudTweet(tweet2));
        System.out.println("¿Cumple con el límite?: " + verificarLimiteCaracteres(tweet2));
        System.out.println();

        System.out.println("Tweet N°3: " + tweet3);
        System.out.println("Nombre de usuario: " + extraerNombreUsuario(tweet3));
        String tweetConcatenado = construirTweet("Bien", "veni", "do.");
        System.out.println("Tweet concatenado: " + tweetConcatenado);

        String tweetConHashtag = concatenarHashtag(tweet1, "#HolaMundo");
        System.out.println("Tweet con hashtag: " + tweetConHashtag);
    }

    public static int calcularLongitudTweet(String tweet) {return tweet.length();}

    public static boolean verificarLimiteCaracteres(String tweet) {return tweet.length() <= 280;}

    public static String concatenarHashtag(String tweet, String hashtag) {return tweet + " " + hashtag;}

    public static String extraerNombreUsuario(String tweet) {
        int index = tweet.indexOf("@");
        if (index != -1) {
            int endIndex = tweet.indexOf(" ", index);
            if (endIndex == -1) {
                return tweet.substring(index + 1);
            } else {
                return tweet.substring(index + 1, endIndex);
            }
        }
        return null;
    }

    public static String construirTweet(String... fragments) {
        StringBuilder sb = new StringBuilder();
        for (String fragment : fragments) {
            sb.append(fragment);
        }
        return sb.toString();
    }
}