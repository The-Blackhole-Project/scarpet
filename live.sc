__config()-> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        'on' -> _() -> on(),
        'off' -> _() -> off()
    }

    team_add('liveStatus')
    team_property('liveStatus', 'color', 'red')
    team_property('liveStatus', 'prefix', format('c◉'))
}

on(
    team_add('liveStatus', player())
    return(print(player(), format(['8 ['], ['e m'], ['b a'], ['6 i'], ['7 SMP'], ['8 ]'], ['f Modalitá live attiva.'])))
)
off(
    team_remove(player())
    return(print(player(), format(['8 ['], ['e m'], ['b a'], ['6 i'], ['7 SMP'], ['8 ]'], ['f Modalitá live disattivata.'])))
)
