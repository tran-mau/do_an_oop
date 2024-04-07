
package dao;

import java.util.ArrayList;


public interface DaoInterface<T> {
    public int them(T t);
    public int sua(T t);
    public int xoa(T t);
    
    public ArrayList<T> selectAll();
    public T selectById(T t);
    public ArrayList<T> selectByCondition(String condition);
}
