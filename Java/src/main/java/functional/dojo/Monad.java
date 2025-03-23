package functional.dojo;

import java.util.function.Function;

public interface Monad<T> extends Functor<T> {
  <U> U flatMap(Function<T, U> fn);

  T getValue();
}
