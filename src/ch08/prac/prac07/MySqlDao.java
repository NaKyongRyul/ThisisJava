package ch08.prac.prac07;

public class MySqlDao implements DataAccessObject {
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    public void insert() {
        System.out.println("My Sql DB에 삽입");
    }

    public void update() {
        System.out.println("My Sql DB를 수정");
    }

    public void delete() {
        System.out.println("My Sql DB에서 삭제");
    }
}
