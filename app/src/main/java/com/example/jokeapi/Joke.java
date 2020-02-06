package com.example.jokeapi;

public class Joke {
    private String type;
    private String joke;
    private String setup;
    private String delivery;
    private boolean nsfw;
    private boolean religious;
    private boolean political;
    private int id;

    Joke(String type, String joke, String setup,
         String delivery, boolean nsfw, boolean
                 religious, boolean political, int id)
    {
        this.type = type;
        this.joke = joke;
        this.setup = setup;
        this.delivery = delivery;
        this.political = political;
        this.religious = religious;
        this.id = id;
    }
        public String getType () {
            return type;
        }

        public void setType (String type){
            this.type = type;
        }

        public String getJoke () {
            return joke;
        }

        public void setJoke (String joke){
            this.joke = joke;
        }

        public String getSetup () {
            return setup;
        }

        public void setSetup (String setup){
            this.setup = setup;
        }

        public String getDelivery () {
            return delivery;
        }

        public void setDelivery (String delivery){
            this.delivery = delivery;
        }

        public boolean isNsfw () {
            return nsfw;
        }

        public void setNsfw ( boolean nsfw){
            this.nsfw = nsfw;
        }

        public boolean isReligious () {
            return religious;
        }

        public void setReligious ( boolean religious){
            this.religious = religious;
        }

        public boolean isPolitical () {
            return political;
        }

        public void setPolitical ( boolean political){
            this.political = political;
        }

        public int getId () {
            return id;
        }

        public void setId (int id){
            this.id = id;
        }

    private Joke() {
    }
}
