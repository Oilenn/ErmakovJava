package numericExer.n3_2.n3;

public class Parrot extends Bird {

    public Parrot(String phrase) {
        super(phrase);
    }

    @Override
    public void sing() {
        char[] newPhrase = phrase.toCharArray();

        for(int i = 0; i < phrase.length(); i++) {
            if(newPhrase[i] == ' ') continue;

            if ((int)(Math.random() * 4) == 1) {
                int charToChange = (int)(Math.random() * (phrase.length() - 1));

                while(newPhrase[charToChange] == ' '){
                    charToChange = (int)(Math.random() * (phrase.length() - 1));
                }

                newPhrase[i] = newPhrase[charToChange];
            }
        }

        System.out.println(String.valueOf(newPhrase));
    }

}
