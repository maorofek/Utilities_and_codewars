function stepDown(stair, width,elazarShtok=[]) {
    if(width===0) {
        return [];
    }
    if (stair - width < 0) {
        elazarShtok.unshift(stair);
        return elazarShtok;
    }
    elazarShtok.unshift(stair);
    return stepDown(stair - width, width,elazarShtok);
}