class nuevaContrasena {

    public boolean esContrasenaSegura(String password) {
        boolean longitud = password.length() >= 8;
        boolean tieneDigito = false;
        boolean tieneEspecial = false;

        for (char c = '0'; c <= '9'; c++) {
            if (password.contains(String.valueOf(c))) {
                tieneDigito = true;
                break;
            }
        }

        String especiales = "!@#$%^&*";
        for (int i = 0; i < especiales.length(); i++) {
            if (password.contains(String.valueOf(especiales.charAt(i)))) {
                tieneEspecial = true;
                break;
            }
        }
        return longitud && tieneDigito && tieneEspecial;
    }

    public String generarContrasenaSegura(String nombre, String apellido, String fechaNacimiento) {
        String especiales = "!@#$%^&*";
        String numeros = "0123456789";

        StringBuffer passwordSeg = new StringBuffer();
        passwordSeg.append(Character.toUpperCase(nombre.charAt(0)));
        passwordSeg.append(apellido.length() > 2 ? apellido.substring(0, 3) : apellido);
        passwordSeg.append(fechaNacimiento.substring(fechaNacimiento.length() - 2));
        passwordSeg.append(especiales.charAt(2));
        passwordSeg.append(numeros.charAt((int) (Math.random() * numeros.length())));

        return passwordSeg.toString();
    }
}
