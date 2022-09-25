import java.util.LinkedHashSet;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
 * Реализовать в java.
 * Создать множество ноутбуков.
 * Реализовать методы фильтрации-сортировки ноутбуки их первоначального множества и 
 * вывести проходящие по условиям. 
 * Сделать так, как мы обсуждали на семинаре (M - V - C)
 */

public class start_program {
    public static void main(String[] args) {
        notebooks_m notebase1 = new notebooks_m("1", "hp", "black", 15);
        notebooks_m notebase2 = new notebooks_m("2", "msi", "white", 17);
        notebooks_m notebase3 = new notebooks_m("3", "xiaomi", "black", 15);
        notebooks_m notebase4 = new notebooks_m("4", "hp", "grey", 14);
        notebooks_m notebase5 = new notebooks_m("5", "asus", "grey", 15);
        LinkedHashSet<notebooks_m> initData = new LinkedHashSet<notebooks_m>();
        initData.add(notebase1);
        initData.add(notebase2);
        initData.add(notebase3);
        initData.add(notebase4);
        initData.add(notebase5);
        notebooks_v.viewData(initData);
        String[] filterData = notebooks_v.getFilterData();
        LinkedHashSet<notebooks_m> resData = notebooks_c.getFilteredArray(initData, filterData[0], filterData[1]);
        notebooks_v.viewData(resData);
    }
}
