package com.tactfactory.javaniveau2.tps.tp1.entities;

import javax.net.ssl.HostnameVerifier;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.*;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

  public Caribou() {
    super();
  }

  public Caribou(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

  @Override
  public void move() {
    if (this instanceof Tetrapoda){

    }
  }



  @Override
  public void eat(Eatable eatable) {
    if (this instanceof Omnivorus) {

    } else if (this instanceof Herbivorus) {
      if (eatable instanceof Vegetable) {
        System.out.println();
      } else {

      }
    } else if (this instanceof Carnivorus) {
      if (eatable instanceof Animal) {
        System.out.println();
      } else {

      }
    }
  }
}
