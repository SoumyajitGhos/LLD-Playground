package SolidPrinciples.LSP;

public class WhatsApp extends SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        /** Not applicable in whatsApp --> Not supporting LSP **/
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
