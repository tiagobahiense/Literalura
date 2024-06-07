package br.com.tiago.Literalura.service;

public interface IDataConverter{
    <T> T getData(String json, Class<T> classe);
}