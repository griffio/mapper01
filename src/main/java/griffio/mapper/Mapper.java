package griffio.mapper;

public interface Mapper<T1, T2> {
  T2 map(T1 input);
}

