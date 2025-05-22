package org.gaboCompany.myproject.ejercicios_POO;

import java.util.List;
import java.util.Objects;

public class Agenda {
    
    protected List<GestorContactos> contactos;

    public Agenda(List<GestorContactos> contactos) {
        this.contactos = contactos;
    }

    public List<GestorContactos> getContactos() {
        return contactos;
    }

    public void addContacto(GestorContactos contacto) {
        boolean add = true;
        if (this.contactos != null) {
            for (GestorContactos elem : this.contactos) {
                if (elem.getEmail().equals(contacto.getEmail()) || elem.getTelefono() == contacto.getTelefono()) {
                    System.err.printf("ERROR: intento de añadimiento de contacto duplicado. Telefono '%d' o Email '%s' repetido.", contacto.getTelefono(), contacto.getEmail());
                    add = false;
                }
            }
        }
        if (add) this.contactos.add(contacto);
    }

    public void findByNombre(String nombre) {
        for (GestorContactos contacto : this.contactos) {
            if (contacto.getNombre().equals(nombre)) System.out.println(contacto);
        }
    }

    public void findNameBySubstring(String sub) {
        for (GestorContactos contacto : this.contactos) {
            if (contacto.getNombre().toLowerCase().contains(sub.toLowerCase())) System.out.printf("Encontrado '%s' en: " + contacto, sub);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda{");
        sb.append("contactos=").append(contactos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.contactos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        return Objects.equals(this.contactos, other.contactos);
    }
}
