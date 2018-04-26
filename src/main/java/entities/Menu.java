package entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Menu {
    private List<String> listNameLinkMenu = new ArrayList<String>();

    public List<String> setListMenuItem(String nameLinkMenu) {
        listNameLinkMenu.add(nameLinkMenu);
        return listNameLinkMenu;
    }

    public List<String> getListMenuPath() {
        if (listNameLinkMenu.size() == 0) {
            throw new RuntimeException("Size menu 0");
        }
        return listNameLinkMenu;
    }
}
