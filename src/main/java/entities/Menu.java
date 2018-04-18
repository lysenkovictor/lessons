package entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> listNameLinkMenu = new ArrayList<String>();

    public List<String> setListMenuItem(String nameLinkMenu) {
        listNameLinkMenu.add(nameLinkMenu);
        return listNameLinkMenu;
    }

    public List<String> getListMenuRoad() {
        if (listNameLinkMenu.size() == 0) {
            throw new RuntimeException("Не заполене");
        }
        return listNameLinkMenu;
    }
}
