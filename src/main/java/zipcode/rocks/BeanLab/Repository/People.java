package zipcode.rocks.BeanLab.Repository;

import zipcode.rocks.BeanLab.Model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private final List<PersonType> personList;

    public People (List<PersonType> personList){
        this.personList = personList;
    }

    public People (){
        this(new ArrayList<>());
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public int size(){
        return this.personList.size();
    }

    public void clear(){
        this.personList.clear();
    }

    public void addAll(PersonType[] personArray){
        for (int i = 0; i < personArray.length; i++){
            add(personArray[i]);
        }
    }

    public PersonType findById(Long id){
        for(PersonType person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    public List<PersonType> getPersonList() {
        return this.personList;
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.stream().iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return Iterable.super.spliterator();
    }
}
