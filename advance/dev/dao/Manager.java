package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import advance.dev.model.TaiLieu;
import advance.dev.model.IManager;

public class Manager implements IManager {
    private List<TaiLieu> taiLieuList = new ArrayList<>();

    @Override
    public void add(TaiLieu tl) {
        taiLieuList.add(tl);
    }

    @Override
    public void print() {
        for (TaiLieu tl : taiLieuList) {
            System.out.println(tl);
        }
    }

    @Override
    public void sortByName(int order) {
        if (order == 1) {
            Collections.sort(taiLieuList, Comparator.comparing(TaiLieu::getTenNhaXuatBan));
        } else if (order == -1) {
            Collections.sort(taiLieuList, Comparator.comparing(TaiLieu::getTenNhaXuatBan).reversed());
        }
    }
}