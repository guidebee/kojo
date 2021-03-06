// A small collage with some images that are shipped with Kojo
// This example is based on Kojo Pictures
def woman = PicShape.image(Costume.womanWaving)
def car = PicShape.image(Costume.car)
def pencil = PicShape.image(Costume.pencil)
def bat1 = PicShape.image(Costume.bat1)
def bat2 = PicShape.image(Costume.bat2)
def title = penColor(purple) -> Picture {
  setPenFont(Font("Serif", 18))
  write("Batmania!")
}

val pic = {
  //Bildrotation rot importieren, um Namenskonflikt mit deutscher Farbe rot zu umgehen:
  import net.kogics.kojo.picture.rot
  picStack(
    trans(-150, -150) -> woman,
    trans(-50, 91) * rot(-10) * opac(-0.3) -> car,
    trans(144, 24) * opac(-0.2) -> pencil,
    trans(-50, 50) * scale(0.5) -> bat1,
    trans(150, 50) * scale(0.5) -> bat2,
    trans(-72, 50) -> title
  )
}

cleari()
draw(pic)
