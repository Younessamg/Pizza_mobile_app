package ma.ensa.pizzaa.Services;

import androidx.annotation.NonNull;

import ma.ensa.pizzaa.Classes.Produit;
import ma.ensa.pizzaa.IDAO.IDAO;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDAO<Produit> {
    private List<Produit> list;
    public ProduitService(){
        list=new ArrayList<>();
    }


    @Override
    public Boolean create(Produit o) {
        return list.add(o);
    }

    @Override
    public Boolean Delete(Produit o) {
        return list.remove(o);
    }

    @Override
    public Boolean Update(Produit o) {
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return this.list;
    }

    @Override
    public Produit findByID(int is) {

        return list.get(is);
    }
}