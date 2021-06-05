final class SocialMedia {
    String name;
    final void masuk() { // Jika method sudah di set Final, maka tidak akan bisa di Override Lagi

    }
}

class Facebook extends SocialMedia {
    void login(String username, String password) { // Jika method sudah di set Final, maka tidak akan bisa di Override Lagi
        // isi method
        masuk();
    }
}

class FakeFacebook extends Facebook {
    void login(String username, String password) {
        // isi method
    }
}
