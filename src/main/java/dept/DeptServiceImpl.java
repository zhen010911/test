package dept;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void get(String name){
        deptDao.get("小张");
        System.out.println("DeptService name = " + name);
    }

}
