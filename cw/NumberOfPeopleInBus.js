var number = function(busStops){
    result = 0;
    busStops.forEach((stop)=>{
        result += stop[0] - stop[1]
    })
    return result
}