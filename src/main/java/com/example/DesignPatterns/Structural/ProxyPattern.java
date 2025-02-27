package com.example.DesignPatterns.Structural;

public class ProxyPattern {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxyImpl();

        try {
            employeeDao.create("ADMIN", new Employee(12));
            employeeDao.delete("ADMIN", 12);
            employeeDao.get("ADMIN", 123);
            employeeDao.get("USER", 456);
            employeeDao.create("USER", new Employee(45)); // no access
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

interface EmployeeDao {
    void create(String client, Employee employeeObj) throws Exception;
    void delete(String client, int employeeId) throws Exception;
    Employee get(String client, int employeeId) throws Exception;
}

class Employee {
    int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, Employee employeeObj) {
        System.out.println("Created new employee in database with id " + employeeObj.getId());
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Deleted the employee in database with id : " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("Fetching the employee in database with id : " + employeeId);
        return new Employee(employeeId);
    }
}

class EmployeeDaoProxyImpl implements EmployeeDao {

    private EmployeeDao employeeDao = null;

    @Override
    public void create(String client, Employee employeeObj) throws Exception {
        if ("ADMIN".equals(client)) {
            if (employeeDao == null) {
                getProxiedObj();
            }
            employeeDao.create(client, employeeObj);
            return;
        }

        throw new Exception("ACCESS DENIED");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if ("ADMIN".equals(client)) {
            if (employeeDao == null) {
                getProxiedObj();
            }
            employeeDao.delete(client, employeeId);
            return;
        }

        throw new Exception("ACCESS DENIED");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if ("ADMIN".equals(client) || "USER".equals(client)) {
            if (employeeDao == null) {
                getProxiedObj();
            }
            return employeeDao.get(client, employeeId);
        }

        throw new Exception("ACCESS DENIED");
    }

    void getProxiedObj(){
        this.employeeDao = new EmployeeDaoImpl();
    }
}