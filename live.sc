__config()-> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        'on' -> _() -> (
            team_add('liveStatus', player());
            return(print(player(), format(['f [', 'y m', 't a', 'd i', 'g SMP', 'f ]', 'w  Modalitá live attiva.'])));
        ),
        'off' -> _() -> (
            team_leave(player());
            return(print(player(), format(['f [', 'y m', 't a', 'd i', 'g SMP', 'f ]', 'w  Modalitá live disattivata.'])));
        )
    };

};
team_add('liveStatus');
team_property('liveStatus', 'color', 'white');
team_property('liveStatus', 'prefix', format('r ● '));

__on_close()->(
    team_remove('liveStatus')
)
