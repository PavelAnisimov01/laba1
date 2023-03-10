package repository;

import common.Man;
import contracts.Mobile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static repository.Repo.getMobile;


class RepoTest {

    @Test
    public void getAges(){
    Man man=new Man("a","01:01:2000","m","1111 000000");
    int actual=23;
    int expected = man.getAge();
    Assertions.assertEquals(expected,actual);
    }


}