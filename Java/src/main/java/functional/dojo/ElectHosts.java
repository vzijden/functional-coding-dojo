package functional.dojo;

import java.util.function.Function;

public class ElectHosts implements Functor<Player> {

  @Override
  public <U> Functor<U> map(Function<Player, U> fn) {
    return null;
  }
}
