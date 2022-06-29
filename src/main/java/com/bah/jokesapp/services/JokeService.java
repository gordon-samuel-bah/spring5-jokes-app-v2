package com.bah.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getQuote() {
        ChuckNorrisQuotes quoter = new ChuckNorrisQuotes();
        return quoter.getRandomQuote();
    }
}
