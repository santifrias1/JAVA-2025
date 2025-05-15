class secondBook {
    String titleBook;
    String nameAuthor;
    String bookCode;
    String state;

    void showInformation() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       INFORMACIÓN DEL LIBRO        ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Título : " + titleBook);
        System.out.println("║ Autor  : " + nameAuthor);
        System.out.println("║ ISBN   : " + bookCode);
        System.out.println("║ Estado : " + state);
        System.out.println("╚════════════════════════════════════╝");
    }

    void lendBook() {
        if (state.equalsIgnoreCase("Disponible")) {
            state = "Prestado";
            System.out.println("El libro " + titleBook + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titleBook + " se encuentra prestado.");
        }
    }

    void returnBook() {
        if (state.equalsIgnoreCase("Prestado")) {
            state = "Disponible";
            System.out.println("Acaba de devolver el libro " + titleBook + ".");
        } else {
            System.out.println("No puede devolver un libro que se encuentra disponible.");
        }
    }
}
