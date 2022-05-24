package com.example.jotter;


import com.example.jotter.domean.Entity.TypeNote;

public class Note {

    private int Id;
    private int previoutId;
    private int rootId;

    private String textNote;
    private int quantityPurchase;
    private TypeNote typeNote;

    public Note(String textNote,TypeNote typeNote,int quantityPurchase,int id , int previoutId,int rootId)  {
        Id = id;
        this.textNote = textNote;
        this.quantityPurchase = quantityPurchase;
        this.previoutId = previoutId;
        this.rootId = rootId;
        this.typeNote = typeNote;

    }

    public  Note(String textNote, String typeNote , int previoutId, int rootId) {
        this.textNote = textNote;
        this.quantityPurchase = quantityPurchase;
        this.previoutId = previoutId;
        this.rootId = rootId;

        switch (typeNote) {

            case "Nomenclature":
                this.typeNote = TypeNote.Nomenclature;
            case "DepartmentNomenclature":
                this.typeNote = TypeNote.DepartmentNomenclature;
            default:
                this.typeNote = TypeNote.Uncertain;
                try {
                    throw new Exception("type note doesent have type");
                } catch (Exception e) {
                    e.printStackTrace();
                }

        }
    }


    public int getPrevioutId() {
        return previoutId;
    }

    public int getRootId() {
        return rootId;
    }

    public String getTextNote() {
        return textNote;
    }

    public int getQuantityPurchase() {
        return quantityPurchase;
    }

    public void setQuantityPurchase(int quantityPurchase) {
        this.quantityPurchase = quantityPurchase;
    }

    public String getTypeNote() {
        return String.valueOf(typeNote);
    }

    public int getId() {

            return Id;
    }

}




