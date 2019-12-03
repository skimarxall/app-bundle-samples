package com.devrel.experiment.large.dynamic.feature.common.a

annotation class Foo2012Fancy
@Foo2012Fancy
class Foo2012 {

  fun foo0(){
    Foo2011().foo8()
  }

  fun foo1(){
    foo0()
  }

  fun foo2(){
    foo1()
  }

  fun foo3(){
    foo2()
  }

  fun foo4(){
    foo3()
  }

  fun foo5(){
    foo4()
  }

  fun foo6(){
    foo5()
  }

  fun foo7(){
    foo6()
  }

  fun foo8(){
    foo7()
  }
}