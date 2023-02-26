package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaFuncion<R,T> {

	public R aplicar(T arg1);
}
