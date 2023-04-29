package com.fernando.services

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class MyService {

    @SuppressWarnings('GrMethodMayBeStatic')
    String meuNome() {
        return 'fernando 2'
    }

}
