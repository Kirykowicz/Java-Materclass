package dev.lpa;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place perth = new Place("Perth", 3923);

        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, aliceSprings);
        addPlace(placesToVisit, brisbane);
        addPlace(placesToVisit, darwin);
        addPlace(placesToVisit, melbourne);
        addPlace(placesToVisit, perth);

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
