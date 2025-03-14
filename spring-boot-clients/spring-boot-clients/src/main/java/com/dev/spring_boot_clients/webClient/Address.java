package com.dev.spring_boot_clients.webClient;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}