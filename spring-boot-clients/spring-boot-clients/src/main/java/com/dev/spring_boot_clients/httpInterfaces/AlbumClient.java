package com.dev.spring_boot_clients.httpInterfaces;

import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface AlbumClient {

    @GetExchange("/albums")
    List<Album> findAll();

}
