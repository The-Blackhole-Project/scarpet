__config()-> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        '' -> _() -> (
            run(
                'kill @e[type=!player,nbt=!{Item:{tag:{display:{Name:"noKill"}}}}]'
            );
            return(
                print(
                    player(),
                    format(
                        '&8[&em&ba&6i&7SMP&8]&f Tutte le entitá sono state eliminate.'
                    )
                )
            )
        )
    }
}
